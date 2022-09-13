import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
        people.add(new ForeignProfesionals());
        people.add(new UsualPeople());
        people.add(new Professionals());
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> list = new ArrayList<String>();
        System.out.println("Введите размерность:");
        int n = scanner.nextInt();



    }
}


interface People {

            public void talk();
        }


class ForeignProfesionals implements People{
            @Override
            public void talk() {
                System.out.println("Я иностарнный профессионал");
            }
        }

class Professionals implements People{
    @Override
    public void talk() {
        System.out.println("Я профессионал");
    }
}

class UsualPeople implements People{
    @Override
    public void talk() {
        System.out.println("Я обычный человек");
    }
}