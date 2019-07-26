import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DownloadManager extends JFrame
        {
    private JTextField addTextField, limitTextField;
    private JButton pauseButton, resumeButton;
    private JButton cancelButton, clearButton;
    public DownloadManager() {
        setTitle("Download Manager");
        setSize(640, 480);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                actionExit();
            }
        });
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem fileExitMenuItem = new JMenuItem("Exit",
                KeyEvent.VK_X);
        fileExitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionExit();
            }
        });
        fileMenu.add(fileExitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        JPanel addPanel = new JPanel();
        addTextField = new JTextField(30);
        limitTextField = new JTextField(5);
        addPanel.add(addTextField);
        addPanel.add(limitTextField);
        JButton addButton = new JButton("Add Download");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               }
        });
        addPanel.add(addButton);
        JPanel downloadsPanel = new JPanel();
        downloadsPanel.setBorder(
                BorderFactory.createTitledBorder("Downloads"));
        downloadsPanel.setLayout(new BorderLayout());
        JPanel buttonsPanel = new JPanel();
        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionPause();
            }
        });
        pauseButton.setEnabled(false);
        buttonsPanel.add(pauseButton);
        resumeButton = new JButton("Resume");
        resumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionResume();
            }
        });
        resumeButton.setEnabled(false);
        buttonsPanel.add(resumeButton);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionCancel();
            }
        });
        cancelButton.setEnabled(false);
        buttonsPanel.add(cancelButton);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionClear();
            }
        });
        clearButton.setEnabled(false);
        buttonsPanel.add(clearButton);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(addPanel, BorderLayout.NORTH);
        getContentPane().add(downloadsPanel, BorderLayout.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
    }
    private void actionExit() {
        System.exit(0);
    }
    private void actionPause() {
        updateButtons();
    }
    private void actionResume() {
        updateButtons();
    }
    private void actionCancel() {
        updateButtons();
    }
    private void actionClear() {
        updateButtons();
    }
    private void updateButtons() {
    }
    public static void main(String[] args) {
        DownloadManager manager = new DownloadManager();
        ImageIcon img = new ImageIcon("icon.png");
        manager.setIconImage(img.getImage());
        manager.setVisible(true);
    }
}