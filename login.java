import java.util. Scanner;
public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ввод и сохранение логина и пароля
        System.out.print("Введите логин: ");
        //считывание строки с клавиатуры и сохранение ее в переменную
        String savedLogin = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String savedPassword = scanner.nextLine();
        //Повторный ввод логина и пароля
        //объявление переменной типа boolean с именем isLoggedIn и присвоение ей значения false
        boolean isLoggedIn = false;
        //будет выполняться, пока значение переменной isLoggedIn равно false
        while (!isLoggedIn) {
            System.out.print("Введите логин еще раз: ");
            String enteredLogin = scanner.nextLine();
            System.out.print("Введите пароль еще раз: ");
            String enteredPassword = scanner.nextLine();

            //Проверка введенных данных на соответствие сохраненным
            if (enteredLogin.equals(savedLogin) && enteredPassword.equals(savedPassword)) {
                System.out.println("Вы успешно вошли в систему!");
                // значения true, чтобы выйти из цикла while
                isLoggedIn = true;
                //начало блока кода, который будет выполняться, если условие не выполняется
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
