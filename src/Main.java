public class Main {

    public static void main(String[] args) {

        System.out.println(Tsk1.dateController("2020/12/23 05:30"));
        System.out.println(Tsk1.dateController("2020/13/77 99:99"));
        System.out.println(Tsk1.dateController("asdasdasd"));

        System.out.println(Tsk2.mailChecker("bc@mail.com"));
        System.out.println(Tsk2.mailChecker("zzz@ccc.v"));
        System.out.println(Tsk2.mailChecker("098098@098"));

        Color [] colors = Color.values();
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i] + " = " + colors[i].getCode());
        }
    }
}