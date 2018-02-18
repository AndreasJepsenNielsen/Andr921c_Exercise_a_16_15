public class Kap16Opgave15 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();
        LinkedIntList B = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);


        B.add(4);
        B.add(2);
        B.add(3);
        B.add(1);


        System.out.println(notEquals(A, B));


    }

    // Kapitel 16 opgave 15

    public static boolean notEquals(LinkedIntList list, LinkedIntList list2)
    {

        for (int i = 0; i < list.size() ; i++) {
            if(list2.get(i) == list.get(i)) {

                if (list.size() == list2.size()) {
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}
