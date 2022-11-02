using System;

        using System.Collections.Generic;

        using System.Linq;

        using System.Text;

        using System.Threading.Tasks;



        namespace Задание__2__часть_

        {



enum PoriGoda

{

    leto = 1,

    zima = 2,

    vesna = 3,

    ocen = 4

}

class Program

{

    class poragoda

    {

        public static poragoda[] a;

        public string fam;

        public string name;





        public poragoda(string fam, string name)

        {

            this.fam = fam;

            this.name = name;



        }

        public static poragoda[] CreateArray()

        {

            poragoda sdt;

            a = new poragoda[4];

            for (int j = 0; j < 4; j++)

            {



                string fam = "";



                string name = "";



                sdt = new poragoda(fam, name);

                a[j] = sdt;

                Console.WriteLine();

            }

            return a;

        }



        public static void print(poragoda[] a)

        {

            a[0].fam = "Температура 45*";

            a[1].fam = "Температура -40*";

            a[2].fam = "Температура 20*";

            a[3].fam = "Температура 13*";

            a[0].name = "Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.";

            a[1].name = "Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.";

            a[3].name = "Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)";

            a[2].name = "Весна — одно из четырёх времён года, переходный сезон между зимой и летом";

            for (int i = 0; i < a.Length; i++)

            {

                Console.WriteLine("-------------------------------------------------------------------");

                Console.WriteLine(a[i].fam);

                Console.WriteLine(a[i].name);

                Console.WriteLine("-------------------------------------------------------------------");



            }



            Console.WriteLine();

        }

    }

    static void Main(string[] args)

    {



        string s;

        Console.WriteLine("Ваше любимая пора года?(лето,зима,осень,весна)");

        s = Console.ReadLine();

        if (s == "лето")

        {

            Console.Write("Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды.");

            Console.WriteLine("В день летнего солнцестояния дни самые длинные, а ночи самые короткие.");

        }

        else if (s == "зима")

        {

            Console.Write("Зима — одно из четырёх времён года, между периодами годового цикла осенью и весной.Основной признак этого времени ");

            Console.WriteLine("года — устойчивая низкая температура(ниже 0 градусов по Цельсию) во многих районах Земли, на поверхность земли выпадает и ложится снег.");

        }

        else if (s == "осень")

        {

            Console.Write("Осень (родственно др.-прусск. assanis — «осень», гот. аsans — «жатва», этимологически — «время жатвы»; по толкованию Даля — от «осенять» — затенять: наступление сумрака)");

            Console.WriteLine(" — одно из четырёх времен года, между летом и зимой.");

        }

        else if (s == "весна")

        {

            Console.Write("Весна — одно из четырёх времён года, переходный сезон между зимой и летом");

            Console.WriteLine(" . Существуют различные методы определения начал и окончания весны, отличающиеся в зависимости от местного климата, культур и обычаев. Когда в Северном полушарии весна, то в Южном полушарии осень и наоборот.");

        }

        else

        {

            Console.WriteLine("Неправильная пора года выхожу!");

            Console.ReadKey();

            Environment.Exit(0);

        }



        Console.WriteLine("1-лето");

        Console.WriteLine("2-зима");

        Console.WriteLine("3-весна");

        Console.WriteLine("4-осень");

        int mb = int.Parse(Console.ReadLine());

        TellAboutPoriGoda(mb);

        Console.WriteLine("Введите лето или зима");

        string mb1 = Console.ReadLine();

        getDescription(mb1);

        poragoda[] a;

        a = poragoda.CreateArray();

        a: poragoda.print(a);



        Console.ReadKey();

    }



    private static void getDescription(string s)

    {

        if (s == "лето") Console.WriteLine("Теплое время года");

        else

        if (s == "зима") Console.WriteLine("Холодное время года");

    }

    private static void TellAboutPoriGoda(int mb)

    {

        double sr = 0;

        switch (mb)

        {

            case (int)PoriGoda.leto:

                sr = 45; Console.WriteLine("Я люблю лето " + sr + "*"); break;

            case (int)PoriGoda.zima:

                sr = -40; Console.WriteLine("Я люблю зиму " + sr + "*"); break;
 [JAVA][JAVA][CODE][JAVA][/JAVA][/CODE][/JAVA][/JAVA]
            case (int)PoriGoda.vesna:

                sr = 20; Console.WriteLine("Я люблю весну " + sr + "*"); break;

            case (int)PoriGoda.ocen:

                sr = 13; Console.WriteLine("Я люблю осень " + sr + "*"); break;



        }

    }

}

}
