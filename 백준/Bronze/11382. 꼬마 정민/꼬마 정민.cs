        string[] inputLine = Console.ReadLine()!.Split();

        long a = long.Parse(inputLine[0]);
        long b = long.Parse(inputLine[1]);
        long c = long.Parse(inputLine[2]);
        
        long output = (a + b + c);
        Console.WriteLine(output);