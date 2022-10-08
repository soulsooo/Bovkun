{
class Program
{
    abstract class Emploee {
        public abstract double Salary();
    }
    class EmploeeTax : Emploee {
    public override double Salary()
    {
        return 20.8 * 8 * 10;

    }

}
    class EmploeeFix : Emploee {
    public override double Salary()
    {
        return 2500;
    }
}

    static void Main(string[] args)
    {
        StreamWriter log_out = null;
        try
        {
            log_out = new StreamWriter("D:/logfile.txt");
            Console.SetOut(log_out);

            EmploeeTax obTax = new EmploeeTax();
            EmploeeFix obFix = new EmploeeFix();
            Console.WriteLine(obTax.Salary());
            Console.WriteLine(obFix.Salary());

            string[] emploees = { "Ivan", "Taras", "Fil", "Stepanich", "Vasil" };
            for (int i = 0; i < 2; i++)

                Console.WriteLine(i + " " + emploees[i] + " " + obTax.Salary());
            for (int j = 2; j < emploees.Length; j++)
                Console.WriteLine(j + " " + emploees[j] + " " + obFix.Salary());
        }
        catch (IOException exc) { Console.WriteLine("IO mistake" + exc.Message); }
        finally { if (log_out != null) log_out.Close(); }



        FileStream fin;
        string s;
        try {
            fin = new FileStream("D:/logfile.txt",FileMode.Open,FileAccess.Read);
        }
        catch (IOException exc) { Console.WriteLine("Cant open file" + exc.Message);
            return;
        }
        StreamReader fin_in = new StreamReader(fin);
        try
        {
            while ((s = fin_in.ReadLine()) != null)
            {
                Console.WriteLine(s);
            }
        }
        catch (IOException exc) { Console.WriteLine("Mistake io" + exc.Message); }
        finally { fin_in.Close();  Console.ReadLine(); }
    }
}
}