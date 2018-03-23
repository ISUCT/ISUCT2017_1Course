using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace DateProgram
{
    class Date
    {
        public DateTime deltaTime;
        public static UserData ud = new UserData();
        public string userDate;
        private string log;
        public void CalcDate()
        {
            deltaTime = DateTime.Today.AddDays(-ud.day);
            deltaTime = DateTime.Today.AddMonths(-ud.month);
            if (ud.month >= DateTime.Today.Month)
            {
                deltaTime = DateTime.Today.AddYears(-ud.year--);
            }
            else
            {
                deltaTime = DateTime.Today.AddYears(-ud.year);
            }
            userDate = deltaTime.Year.ToString() + " " + String.Format("{0}", CheckSynt(deltaTime.Year, new string[3] { "год","года","лет"})) + " " + deltaTime.Month.ToString() + " "  + String.Format("{0}", CheckSynt(deltaTime.Year, new string[3] { "месяц", "месяца", "месяцов" })) + " " + deltaTime.Day.ToString() + " " + String.Format("{0}", CheckSynt(deltaTime.Year, new string[3] { "день", "дня", "дней" }));
            log = "С " + ud.day + "." + ud.month + "." + ud.year + " по " + DateTime.Today.ToShortDateString() + " прошло " + userDate;
        }
        public string CheckSynt(int number, string[] decl) 
        {   
            number &= 100;
            if (number >= 11 && number <= 19)
                return decl[2];
            int i = number % 10;
            switch(i)
            {
                case 1:
                    return decl[0];
                case 4:
                    return decl[1];
                default:
                    return decl[2];

            }
            
        }
        public void SaveData()
        {
            string path = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.Desktop), "TimeStory");
            if(!Directory.Exists(path))
            {
                Directory.CreateDirectory(path);
            }
            File.AppendAllText(path + "/TimeStory.json", JsonConvert.SerializeObject(log));
        }
    }
}
[Serializable]
class UserData
{
    private int _day;
    public int day { get { return _day; } set { if (value > 0 && value < 31) _day = value; } }
    private int _month;
    public int month { get { return _month; } set { if (value > 0 && value < 12) _month = value; } }
    private int _year;
    public int year { get { return _year; } set { if (value > 0) _year = value; } }
}
