import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int test1;
        int test2;
        double avg;
        String inputReader;
        String studentID;
        String name;

        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Podaj imię i nazwisko: ");
        name = keyboard.nextLine();

        studentID = JOptionPane.showInputDialog("Wprowadz ID: ");
        for ( ; ; ) {
            inputReader = JOptionPane.showInputDialog(dialog,"Wprowadz wynik pierwszego testu: ");
            test1 = Integer.parseInt(inputReader);
            if (test1 < 0 || test1 > 100) {
                JOptionPane.showMessageDialog(dialog,"ERROR! \nWynik z testu 1. nie może być większy niż 100 i mniejszy niż 0");
                continue;
            }
            inputReader = JOptionPane.showInputDialog(dialog,"Wprowadz wynik drugiego testu: ");
            test2 = Integer.parseInt(inputReader);
            if (test2 < 0 || test2 > 100) {
                JOptionPane.showMessageDialog(dialog,"ERROR! \nWynik z testu 2. nie może być większy niż 100 i mniejszy niż 0");
                continue;
            } else break;
        }
        avg = ((double)test1 + (double)test2) / 2;
        if(avg >= 90){
            JOptionPane.showMessageDialog(dialog, "Stypendium przyznane.\n" + "Twoja średnia wynosi: " + avg);
        } else
        {
            JOptionPane.showMessageDialog(dialog, "Stypendium nieprzyznane.\n" + "Twoja średnia wynosi: " + avg);
        }
        System.exit(0);
    }
}
