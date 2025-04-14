namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine()!.Split();
            int a = int.Parse(input[0]);
            int b = int.Parse(input[1]);
            int c = int.Parse(input[2]);
        
            Console.WriteLine((a+b)%c);
            Console.WriteLine(((a%c) + (b%c))%c);
            Console.WriteLine((a*b)%c);
            Console.WriteLine(((a%c) * (b%c))%c);
        }
    }
}