/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupekepart2;

public class CommandExample
        
{
    Parser parser = new Parser();
    MarupekePart2 mp;
    public CommandExample() {
    
    }
    
    private void execute(Command c) {
        
        switch(c.getCommand()) {
            case NEW:
                mp = mp.randomPuzzle(c.getSize(), c.getNumFill(), c.getNumX(), c.getNumO());
                System.out.println(c);
                System.out.println(mp);
                break;
            case MARKX: 
                mp.markX(c.getRow(), c.getColumn());
                System.out.println(c);
                System.out.println(mp);
                break;
            case MARKO:
                mp.markO(c.getRow(), c.getColumn());
                System.out.println(c);
                System.out.println(mp);
                break;
            case UNMARK:
                mp.unmark(c.getRow(), c.getColumn());
                System.out.println(c);
                System.out.println(mp);
                break;
            case QUIT: System.out.println(c.getMsg());
                break;
            default:
                System.out.println(c);
            }
            printPrompt(c.getMsg());
        }
    
    private void commandLine() {
        printPrompt("New Game");
        Command c = parser.getCommand();
        while(c.getCommand() != CommandWord.QUIT) {
            execute(c);
            c = parser.getCommand();
        }
    }
    private void printPrompt(String msg) {
        System.out.println(msg);
        System.out.print(">");
    }
public static void main(String args[]) {
    CommandExample ct = new CommandExample();
    ct.commandLine();
}
}
