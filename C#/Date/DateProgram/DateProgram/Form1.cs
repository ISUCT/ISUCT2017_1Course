using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DateProgram
{
    public partial class Form1 : Form
    {
        Date date = new Date();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            date.CalcDate();
            textBox4.Text = date.result;
            date.SaveData();
            label6.Text = date.saveStr;
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            Date.ud.year = dateTimePicker1.Value.Year;
            Date.ud.month = dateTimePicker1.Value.Month;
            Date.ud.day = dateTimePicker1.Value.Day;
            Date.ud.hour = dateTimePicker1.Value.Hour;
            Date.ud.minute = dateTimePicker1.Value.Minute;
        }
    }
}
