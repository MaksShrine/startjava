public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 22;
        String gender = "male";
        double height = 1.79;
        if(age > 20) {
            System.out.println("Старше 20 лет");
        } else {
            System.out.println("Младше 20 лет");
        }
        if(gender != "male") {
            System.out.println("Женского пола");
        } else {
            System.out.println("Мужского пола");
        }
        if(height < 1.80) {
            System.out.println("Невысокого роста");
        } else {
            System.out.println("Высокого роста");
        }
        char nameFirstLetter = "Ali".charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.println("Имя начинается на M");
        } else if(nameFirstLetter == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается не на M и не на I");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 134;
        int num2 = 257;
        if(num1 > num2) {
            System.out.println(num1 + " - максимальное, " + num2 + " - минимальное.");
        } else if(num1 < num2) {
            System.out.println(num2 + " - максимальное, " + num1 + " - минимальное.");
        } else {
            System.out.println(num2 + " и " + num1 + " - равны.");
        }

        System.out.println("\n3. Проверка числа");
        num1 = -13;
        boolean bool = num1 % 2 == 0;
        if(num1 != 0) {
            if(bool) {
                System.out.println(num1 + " - чётное.");
            } else {
                System.out.println(num1 + " - нечётное.");
            }
            if(num1 < 0) {
                System.out.println(num1 + " - отрицательное.");
            } else {
                System.out.println(num1 + " - положительное.");
            }
        } else {
            System.out.println(num1 + " - число равно 0.");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 325;
        /* Не стал вводить дополнительные переменные, пусть дублируется арифметика, ведь 
        незатратные операции и вроде читаемо. Или всё же так вообще не желательно делать? */
        if((num1 % 10) != (num2 % 10) && (num1 / 10 % 10) != (num2 / 10 % 10) && 
                (num1 / 100) != (num2 / 100)) {
            System.out.println(num1 + " и " + num2 + 
                    " не имеют одинаковых цифр, стоящих в оном разряде.");
        } else {
            if((num1 % 10) == (num2 % 10)) {
                System.out.println(num1 + " и " + num2 + " имеют одинаковые цифры " + 
                        (num1 % 10) + " в 1 разряде.");
            }
            if((num1 / 10 % 10) == (num2 / 10 % 10)) {
                System.out.println(num1 + " и " + num2 + " имеют одинаковые цифры " + 
                        (num1 / 10 % 10) + " во 2 разряде.");
            }
            if((num1 / 100) == (num2 / 100)) {
                System.out.println(num1 + " и " + num2 + " имеют одинаковые цифры " + 
                        (num1 / 100) + " в 3 разряде.");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if((symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println(symbol + " - большая буква.");
        } else if((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println(symbol + " - маленькая буква.");
        } else if((symbol >= '0') && (symbol <= '9'))  {
            System.out.println(symbol + " - цифра.");
        } else {
            System.out.println(symbol + " - не буква и не цифра.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000; // не стал вводить переменные для лимитов, процентов и результатов.
        if(deposit < 100_000) {
            System.out.println("Сумма вклада: " + deposit + ", сумма начислений: " + 
                    (deposit / 100 * 5) + ", итоговая сумма: " + (deposit + (deposit / 100 * 5)));
        } else if(deposit >= 100_000 && deposit <= 300_000) {
            System.out.println("Сумма вклада: " + deposit + ", сумма начислений: " + 
                    (deposit / 100 * 7) + ", итоговая сумма: " + (deposit + (deposit / 100 * 7)));
        } else if(deposit > 300_000) {
            System.out.println("Сумма вклада: " + deposit + ", сумма начислений: " + 
                    (deposit / 100 * 10) + ", итоговая сумма: " + (deposit + (deposit / 100 * 10)));
        }

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int historyScore;
        int programmingScore;
        if(history <= 91) {
            if(history <= 73) {
                if(history > 60) {
                    historyScore = 3;
                } else {
                    historyScore = 2;
                }
            } else {
                historyScore = 4;
            }
        } else {
            historyScore = 5;
        }
        if(programming <= 91) {
            if(programming <= 73) {
                if(programming > 60) {
                    programmingScore = 3;
                } else {
                    programmingScore = 2;
                }
            } else {
                programmingScore = 4;
            }
        } else {
            programmingScore = 5;
        }
        System.out.println(historyScore + " - оценка по истории\n" + programmingScore + 
                " - оценка по программированию\n" + ((historyScore + programmingScore) / 2) + 
                " - средняя оценка\n" + ((history + programming) / 2) + "% - средний процент");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int revenue = 13_000;
        int costPrice = 9000;
        int profit = (revenue - (costPrice + rent)) * 12;
        if(profit > 0) {
            System.out.println("прибыль за год: " + '+' + profit);
        } else if(profit < 0) {
            System.out.println("прибыль за год: "  + profit);
        } else {
            System.out.println("прибыль за год: 0");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int amount = 567;
        int oneHundred$BillsNumber =  10; // проблемы у меня с переменными)))
        int ten$BillsNumber = 5;
        int one$BillsNumber = 50;
        int issuedOneHundred$BillsNumber;
        int issuedTen$BillsNumber;
        int issuedOne$BillsNumber = 0;
        if((100 * oneHundred$BillsNumber + 10 * ten$BillsNumber + 1 * one$BillsNumber) >= amount) {
            if((amount / 100) <= oneHundred$BillsNumber) {
                issuedOneHundred$BillsNumber = amount / 100;
                if(((amount - 100 * issuedOneHundred$BillsNumber) / 10) <= ten$BillsNumber) {
                    issuedTen$BillsNumber = (amount - 100 * issuedOneHundred$BillsNumber) / 10;
                    issuedOne$BillsNumber = amount - (100 * issuedOneHundred$BillsNumber + 10 * 
                            issuedTen$BillsNumber);
                } else {
                    issuedTen$BillsNumber = ten$BillsNumber;
                    issuedOne$BillsNumber = amount - (100 * issuedOneHundred$BillsNumber + 10 * 
                            issuedTen$BillsNumber);
                }
            } else {
                issuedOneHundred$BillsNumber = oneHundred$BillsNumber;
                issuedTen$BillsNumber = ten$BillsNumber;
                issuedOne$BillsNumber = one$BillsNumber;
            }
            System.out.println(issuedOneHundred$BillsNumber + " банкнот номиналом 100\n" + 
                issuedTen$BillsNumber + " банкнот номиналом 10\n" + issuedOne$BillsNumber + 
                " банкнот номиналом 1\n" + "Сумма: " + amount);
        } else {
            System.out.println("В банкомате недостаточно денег!");
        }
    }
}
