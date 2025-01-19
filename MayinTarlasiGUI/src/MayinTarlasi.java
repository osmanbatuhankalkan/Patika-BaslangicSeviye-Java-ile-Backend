import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MayinTarlasi implements MouseListener {
    JFrame frame;
    Btn[][] board = new Btn[10][10];
    int openButton;
    public MayinTarlasi() {
        int openButton=0;
        frame = new JFrame("Mayin Tarlasi");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10,10));

        for(int row = 0; row<board.length;row++) {
            for(int col = 0; col<board[0].length;col++) {
                Btn b = new Btn(row, col);
                frame.add(b);
                b.addMouseListener(this);
                board[row][col] = b;
            }
        }

        generateMine();
        updateCount();
        //print();
        printMine();

        frame.setVisible(true);
    }
    public void updateCount(){
        for(int row = 0; row<board.length;row++) {
            for(int col = 0; col<board[0].length;col++) {
                if(board[row][col].isMine()) {
                    counting(row,col);
                }
            }
        }
    }
    public void counting(int row, int col){
        for(int i= row -1; i<=row+1;i++) {
            for(int k = col-1; k<=col+1;k++) {
            try {
                int value = board[i][k].getCount();
                board[i][k].setCount(++value);
            }catch(Exception e) {

            }
            }
        }
    }
    public void generateMine(){
        int i=0;
        while(i<10){
            int randRow = (int)(Math.random()*board.length);
            int randCol = (int)(Math.random()*board[0].length);

            while(board[randRow][randCol].isMine()){
                randRow = (int)(Math.random()*board.length);
                randCol = (int) (Math.random() * board[0].length);
            }
            board[randRow][randCol].setMine(true);
            i++;
        }
    }
    public void print(){
        for(int row = 0; row<board.length;row++) {
            for(int col = 0; col<board[0].length;col++) {
                if(board[row][col].isMine()){
                    ImageIcon icon = new ImageIcon("/Users/osmanbatuhankalkan/Desktop/MayinTarlasiGUI/mine.png");
                    Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    board[row][col].setIcon(new ImageIcon(img));
                }
                else{
                    board[row][col].setText(board[row][col].getCount()+"");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }
    public void printMine(){

        for(int row = 0; row<board.length;row++) {
            for(int col = 0; col<board[0].length;col++) {
                if(board[row][col].isMine()){
                    ImageIcon icon = new ImageIcon("/Users/osmanbatuhankalkan/Desktop/MayinTarlasiGUI/mine.png");
                    Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                    board[row][col].setIcon(new ImageIcon(img));
                }
            }
        }
    }
    public static void main(String[] args) {
        new MayinTarlasi();
    }
    public void open(int r,int c){
        if(r<0||r>=board.length||c<0||c>=board[0].length||board[r][c].getText().length()>0||board[r][c].isEnabled()==false){
            return;
        } else if (board[r][c].getCount() !=0) {
            board[r][c].setText(board[r][c].getCount()+"");
            board[r][c].setEnabled(false);
            openButton++;
        }else {
            openButton++;
            board[r][c].setEnabled(false);
            open(r+1,c);
            open(r-1,c);
            open(r,c-1);
            open(r,c+1);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        Btn b = (Btn) e.getSource();
        if(e.getButton()==1){
            System.out.println("sol tık");
            if(b.isMine()){
                JOptionPane.showMessageDialog(frame,"Mayına Bastınız, Oyun Bitti.!!!!!!!");
                print();
            }else{
                open(b.getRow(),b.getCol());
                if(openButton==(board.length*board[0].length)-10){
                    JOptionPane.showMessageDialog(frame,"Tebrikler Oyunu Kazandınız !");
                }
            }
        }else if(e.getButton()==3){
            System.out.println("sağ tık");
            if(!b.isFlag()){
                ImageIcon icon = new ImageIcon("/Users/osmanbatuhankalkan/Desktop/MayinTarlasiGUI/flag.png");
                Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                b.setIcon(new ImageIcon(img));
                b.setFlag(true);
            }else{
                b.setIcon(null);
                b.setFlag(false);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
