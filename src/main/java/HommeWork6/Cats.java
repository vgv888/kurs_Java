package HommeWork6;

public class Cats extends Animals {
    final int catsRun = 200;
    final int catsSwim = 0;



    private static final String baest = "Кот";

    public Cats(String name, int run, int swim){
        super(name, run, swim, baest);

        if(run > catsRun){
            System.out.printf("%s %s не сможет пробежать, он устанет",baest,name);
    }else System.out.printf("%s %s пробежвл %d, а плавать так и не научился",baest,name,getRun());
        {
            System.out.println();
        }


    }
    }


