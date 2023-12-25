/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marupekepart2;

/**
 * @author ianw
 * A representation of what the user wants the game to do next.   
 */
public class Command {
	private CommandWord command;
	private int row = 0;
	private int column = 0;
        private int size = 0;
        private int numFill = 0;
        private int numX = 0;
        private int numO = 0;
	private String msg = "";
	
	/**
	 * Initialise with a Command and a message (which may be empty)
	 * @param command
	 * @param msg
	 */
	public Command(CommandWord command, String msg) {
		this.command = command;
		this.msg = msg;
	}

	/**
	 * Messages are currently only associated with "unknown" commands
	 * @return the message associated with the command
	 */
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * If we have a command that operated on coordinates, instantiate 
         * with the correct row and column
	 * @param command
	 * @param row
	 * @param column
	 */
	public Command(CommandWord command, int row, int column) {
		super();
		this.command = command;
		this.row = row;
		this.column = column;
	}
        
        public Command(CommandWord command, int size, int numFill, int numX, int numO){
                super();
                this.command = command;
                this.size = size;
                this.numFill = numFill;
                this.numX = numX;
                this.numO = numO;
        }

	@Override
	public String toString() {
		return "Command " + command + ", row=" + row + ", column="
				+ column + ", size=" + size;
	}

	/**
	 * Principally to be used in a switch statement to decide on the
	 * action to be taken, given this command
	 * @return the CommandWord 
	 */
	public CommandWord getCommand() {
		return command;
	}

	public void setCommand(CommandWord command) {
		this.command = command;
	}
	/**
	 * Valid for commands which need a row and column value
	 * @return The row value
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Valid for commands which need a row and column value
	 * @param row
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * Valid for commands which need a row and column value
	 * @return The column value
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * Valid for commands which need a row and column value
	 * @param column
	 */
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getSize() {
                return size;
        }
        
        public void setSize(int size){
                this.size = size;
        }
        
        public int getNumFill(){
                return numFill;
        }
        
        public void setNumFill(int numFill){
                this.numFill = numFill;
        }
        
        public int getNumX(){
                return numX;
        }
        
        public void setNumX(int numX){
                this.numX = numX;
        }
        
        public int getNumO(){
                return numO;
        }
        
        public void setNumO(int numO){
                this.numO = numO;
        }
	
}
