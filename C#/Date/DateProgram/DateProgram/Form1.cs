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

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            Date.ud.day = Convert.ToInt32(textBox1.Text);
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            Date.ud.month = Convert.ToInt32(textBox2.Text);
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            Date.ud.year = Convert.ToInt32(textBox3.Text);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            date.CalcDate();
            label5.Text = date.userDate;
            date.SaveData();
        }
    }
}
