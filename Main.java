package novoexemplo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NovoExemplo {


    public static void main(String[] args) {

    JFrame frame = new JFrame("Exemplo JComboBox");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,150);

frame.setLocationRelativeTo(null);

JPanel panel = new JPanel();
frame.add(panel);

JLabel label = new JLabel("Você gosta de programação Java?");
panel.add(label);

JRadioButton simRadioButton = new JRadioButton("Sim");
JRadioButton naoRadioButton = new JRadioButton("Não");

ButtonGroup grupoOpcoes = new ButtonGroup();
grupoOpcoes.add(simRadioButton);
grupoOpcoes.add(naoRadioButton);

panel.add(simRadioButton);
panel.add(naoRadioButton);

JButton button = new JButton("Exibir Opção Selecionada");
panel.add(button);

JTextField textField = new JTextField(15);
panel.add(textField);

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String opcaoSelecionada = "";

        if(simRadioButton.isSelected()){
            opcaoSelecionada = "Sim";
        } else if (naoRadioButton.isSelected()) {
            opcaoSelecionada = "Não";
        }

        textField.setText("Opção Selecionada: " + opcaoSelecionada);
    }
});

frame.setVisible(true);
    }
}
