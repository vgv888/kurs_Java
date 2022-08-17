package HommeWork11;

public class Main {
    public static void main(String[] args) {




    //        String[] ArraysString = {"Привет", "как", "твои", "дела", "как", "мои", "дела", ",", "хорошо", "мои", "дела", "как", "твои"};
//        Map<String, Integer> map = new HashMap<>();
//        for (String array : ArraysString) {
//            Integer count = map.getOrDefault(array, 0);
//            map.put(array, count + 1);
//        }
//        System.out.println(map);
//        System.out.println(map.keySet());
    NoteBook();

}
    public static void NoteBook(){
        HommeWork11.NoteBook book= new HommeWork11.NoteBook();
        book.add("Васильев","+79114877847");
        book.add("Васильев","+79114777847");
        book.add("Иванов","+79118874515");
        book.add("Алексеев","+79874561245");

        System.out.println("Васильев"+ book.get("Васильев"));
        System.out.println("Васильев"+ book.get("Васильев"));
        System.out.println("Иванов"+book.get("Иванов"));
        System.out.println("Алексеев"+book.get("Алексеев"));
    }
}


