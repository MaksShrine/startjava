public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte cores = 4;
        short frequency = 3200;
        int ssd = 512;
        long hdd = 1024L;
        float ram = 16.00F;
        double price = 35.999;
        char modification = 'X';
        boolean updatable = false;
        System.out.println(cores + " ядра процессора\n" + frequency + " МГц\n" + 
                ssd + " ГБ ssd\n" + hdd + " ГБ hdd\n" + ram + " ГБ оперативки\n" + 
                "Модель: " + modification + '\n' + "Цена: " + price + '\n' + 
                "Возможность улучшения: " + updatable);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int discount = 11;
        int totalCost = penCost + bookCost;
        int discountCost = totalCost / 100 * discount;
        System.out.println(totalCost + "\n" + discountCost + "\n" + (totalCost - discountCost));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J   a  v     v  a  \n" + "    J  a a  v   v  a a\n" + 
                " J  J aaaaa  V V  aaaaa\n" + "  JJ a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127; // byteMaxValue - думаю не правильно, так как это не константа.
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9_223_372_036_854_775_807L;
        System.out.println("byte : " + byteNum + ' ' + ++byteNum + ' ' + --byteNum + '\n' + 
                "short : " + shortNum + ' ' + ++shortNum + ' ' + --shortNum + '\n' + "int : " 
                + intNum + ' ' + ++intNum + ' ' + --intNum + '\n' + "long : " + longNum + 
                ' ' + ++longNum + ' ' + --longNum);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("с помощью третьей переменной\n" + a + ' ' + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
        System.out.println("с помощью арифметических операций\n" + a + ' ' + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a + " " + b);
        System.out.println("с помощью побитовой операции\n" + a + ' ' + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a  + " " + b );

        System.out.println("\n6. Вывод символов и их кодов");
        char numberSign = '#';
        char ampersand = '&';
        char atSymbol = '@';
        char circumflex = '^';
        char underscore = '_';
        System.out.println((int) numberSign + " " + numberSign + "\n" + (int) ampersand + " " + 
                ampersand + "\n" + (int) atSymbol + " " + atSymbol + "\n" + (int) circumflex + 
                " " + circumflex + "\n" + (int) underscore + " " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + backslash + '\n' + "   " + slash + "  " + 
                backslash + '\n' + "  " + slash + underscore + openParenthesis + ' ' + 
                closeParenthesis + backslash + '\n' + ' ' + slash + "      " + backslash + '\n' + 
                slash + underscore + underscore + underscore + underscore + slash + backslash + 
                underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит\n" + hundreds + 
                " сотен\n" + tens + " десятков\n" + ones + " единиц\n" + 
                "Сумма его цифр = " + (hundreds + tens + ones) + 
                '\n' + "Произведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int sec = 86399;
        System.out.println((sec / 3600) + ":" + (sec % 3600 / 60) + ":" + 
                (sec % 60));
    }
}
