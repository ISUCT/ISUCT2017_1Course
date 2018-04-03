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
        public TimeSpan deltaTime;
        public DateTime todayDate;
        public DateTime userDate;
        public static UserData ud = new UserData();
        public string result;
        private string log;

        public string saveStr;
        public int index;
        public void CalcDate()
        {
            userDate = new DateTime(ud.year, ud.month, ud.day);
            todayDate = DateTime.Now;
            deltaTime = todayDate.Subtract(userDate);
            result = deltaTime.Days.ToString() + " " + String.Format("{0}", CheckSynt(deltaTime.Days, new string[3] { "день", "дня", "дней" })) + " " + deltaTime.Hours.ToString() + " " + String.Format("{0}", CheckSynt(deltaTime.Hours, new string[3] { "час", "часа", "часов" })) + " " + deltaTime.Minutes.ToString() + " " + String.Format("{0}", CheckSynt(deltaTime.Minutes, new string[3] { "минута", "минуты", "минут" }));
            log = "С " + ud.day + "." + ud.month + "." + ud.year + " по " + DateTime.Today.ToShortDateString() + " прошло " + result;
        }
        public string CheckSynt(int number, string[] decl)
        {
            number &= 100;
            if (number >= 11 && number <= 19)
                return decl[2];
            int i = number % 10;
            switch (i)
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
            if (!Directory.Exists(path))
            {
                Directory.CreateDirectory(path);
            }
            File.AppendAllText(path + "/TimeStory.json", JsonConvert.SerializeObject(log));
            index += 1;
            saveStr = "Дата сохранена в TimeStory.json " + "[" + index + "]";
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
    public int year { get { return _year; } set { if (value > 0 && value <= DateTime.Now.Year) _year = value; } }
    private int _hour;
    public int hour { get { return _hour; } set { if (value > 0) _hour = value; } }
    private int _minute;
    public int minute { get { return _minute; } set { if (value > 0) _minute = value; } }
}
