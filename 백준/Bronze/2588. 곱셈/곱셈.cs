namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int input1 = int.Parse(Console.ReadLine()!);
            string input2 = Console.ReadLine()!;
            for (int i = input2.Length - 1; i >= 0 ; i--)
            {
                Console.WriteLine(input1 * int.Parse(input2.Substring(0, input2.Length)[i].ToString()));
            }
            Console.WriteLine(input1 * int.Parse(input2));
        }
    }
}