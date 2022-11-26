public class truthtable {

    public void printTruthTableOR() {
        System.out.println("   a\t|   b\t|  a||b\t| OK/ER");
        System.out.println("-------------------------------");
        System.out.println(line_AorB(false, false) + line_AorB_Expected(false, false, false));
        System.out.println(line_AorB(false, true) + line_AorB_Expected(false, true, true));
        System.out.println(line_AorB(true, false) + line_AorB_Expected(true, false, true));
        System.out.println(line_AorB(true, true) + line_AorB_Expected(true, true, true));
    }

     public String line_AorB(boolean a, boolean b) {
         return " " + a + "\t" + "| " + b + "\t" + "| " + (a || b) + "\t" + "| ";
     }

     public String line_AorB_Expected(boolean a, boolean b, boolean expected) {
         boolean calced = (a || b);
         String check;
         if (calced == expected) {
             check = "OK";
            } else {
                check = "ER";
         }
         return check;
     }

    public void printTruthTableAND() {
        System.out.println("   a\t|   b\t|  a&&b\t| OK/ER");
        System.out.println("-------------------------------");
        System.out.println(line_AandB(false, false) + line_AandB_Expected(false, false, false));
        System.out.println(line_AandB(false, true) + line_AandB_Expected(false, true, false));
        System.out.println(line_AandB(true, false) + line_AandB_Expected(true, false, false));
        System.out.println(line_AandB(true, true) + line_AandB_Expected(true, true, true));
    }

     public String line_AandB(boolean a, boolean b) {
         return " " + a + "\t" + "| " + b + "\t" + "| " + (a && b) + "\t" + "| ";
     }

     public String line_AandB_Expected(boolean a, boolean b, boolean expected) {
         boolean calced = (a && b);
         String check;
         if (calced == expected) {
             check = "OK";
            } else {
                check = "ER";
         }
         return check;
     }

    public void printTruthTableNOT() {
        System.out.println("   a\t|  !a\t| OK/ER");
        System.out.println("-----------------------");
        System.out.println(line_AnotA(false) + line_AnotA_Expected(false, true));
        System.out.println(line_AnotA(true) + line_AnotA_Expected(true, false));
        }

    public String line_AnotA(boolean a) {
        return " " + a + "\t" + "| " + !a + "\t" + "| ";
    }

    public String line_AnotA_Expected(boolean a, boolean expected) {
        boolean calced = !a;
        String check;
        if (calced == expected) {
            check = "OK";
            } else {
                check = "ER";
        }
        return check;
    }

    public void printTruthTable_NOT_AorB_AND_notC() {
        System.out.println("   a\t|   b\t|   c\t| !(a||b)&&(!c)\t| OK/ER");
        System.out.println("-----------------------------------------------");
        System.out.println(line_NOT_AorB_AND_notC(false, false, false) + line_NOT_AorB_AND_notC_Expected(false, false, false, true));
        System.out.println(line_NOT_AorB_AND_notC(true, false, false) + line_NOT_AorB_AND_notC_Expected(true, false, false, false));
        System.out.println(line_NOT_AorB_AND_notC(false, true, false) + line_NOT_AorB_AND_notC_Expected(false, true, false, false));
        System.out.println(line_NOT_AorB_AND_notC(false, false, true) + line_NOT_AorB_AND_notC_Expected(false, false, true, false));
        System.out.println(line_NOT_AorB_AND_notC(false, true, true) + line_NOT_AorB_AND_notC_Expected(false, true, true, false));
        System.out.println(line_NOT_AorB_AND_notC(true, false, true) + line_NOT_AorB_AND_notC_Expected(true, false, true, false));
        System.out.println(line_NOT_AorB_AND_notC(true, true, false) + line_NOT_AorB_AND_notC_Expected(true, true, false, false));
        System.out.println(line_NOT_AorB_AND_notC(true, true, true) + line_NOT_AorB_AND_notC_Expected(true, true, true, false));
    }

    public String line_NOT_AorB_AND_notC(boolean a, boolean b, boolean c) {
        return " " + a + "\t" + "| " + b + "\t" + "| " + c + "\t" + "| " + "    " + (!(a || b) && !c) + "   " + "\t" + "| ";
    }

    public String line_NOT_AorB_AND_notC_Expected(boolean a, boolean b, boolean c, boolean expected) {
        boolean calced = (!(a || b) && !c);
        String check;
        if (calced == expected) {
            check = "OK";
        } else {
            check = "ER";
        }
        return check;
    }

    public void printLoopVersionOf_Not_A_oder_B_undNot_C() {
        boolean[][] test = getValues(3);

        System.out.println("   a\t|   b\t|   c\t| !(a||b)&&(!c)");
        System.out.println("---------------------------------------");

        for (boolean[] b : test) {
            printZeileNot_A_oder_B_undNot_C(b[0], b[1], b[2]);
        }

    }

    private void printZeileNot_A_oder_B_undNot_C(boolean a, boolean b, boolean c) {
        boolean erg = !(a || b) && !c;
        System.out.format("%b\t%b\t%b\t\t%b\n", a, b, c, erg);
    }

    public boolean[][] getValues(int number) {

        boolean[][] values = new boolean[(int) Math.pow(2, number)][number];

        for (int i = 0; i < Math.pow(2, number); i++) {
            String s = Integer.toBinaryString(i);
            while (s.length() != number) {
                s = "0" + s;
            }
            for (int j = 0; j < number; j++) {
                values[i][j] = s.toCharArray()[j] == '1';
            }
        }

        return values;
    }
}
