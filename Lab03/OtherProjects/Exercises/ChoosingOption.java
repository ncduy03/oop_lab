import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                    "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: "
                    + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        int choice = JOptionPane.showOptionDialog
        System.exit(0);
    }
}