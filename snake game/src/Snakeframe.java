import javax.swing.JFrame;
class SnakeFrame extends JFrame {
    SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake Clasic");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
