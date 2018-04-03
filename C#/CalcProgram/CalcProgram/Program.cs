using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcProgram
{
    class Program
    {
        private double x_1 = 1.25;
        private double x_2 = 3.25;
        private double x_delta = 0.4;
        private double[] values = new double[5] { 1.84, 2.71, 3.81, 4.56, 5.62 };
        public void CalculationWithDelta(double x_var)
        {
            x_var = x_1;
            for (double a = x_var; x_var <= x_2; x_var += x_delta)
            {
                double y = Math.Pow(Math.Abs((Math.Pow(x_var, 2)) - 2.5), 1.0 / 4) + Math.Pow(Math.Log(Math.Pow(x_1, 2)), 1.0 / 3);
                Console.WriteLine("При значении x = " + x_var + ", с шагом " + x_delta + ", y = " + y);
            }
        }
        public void CalculationWithoutDelta(double[] val_x)
        {
            val_x = values;
            for (int a = 0; a < val_x.Length; a++)
            {
                double y = Math.Pow(Math.Abs((Math.Pow(val_x[a], 2)) - 2.5), 1.0 / 4) + Math.Pow(Math.Log(Math.Pow(x_1, 2)), 1.0 / 3);
                Console.WriteLine("При значении x = " + val_x[a] + ", y = " + y);
            }
        }
        static void Main(string[] args)
        {
            Program program = new Program();
            Console.WriteLine("Variant 4");
            program.CalculationWithDelta(program.x_1);
            Console.WriteLine("------------------------");
            program.CalculationWithoutDelta(program.values);
            Console.ReadKey();
        }
    }
}
