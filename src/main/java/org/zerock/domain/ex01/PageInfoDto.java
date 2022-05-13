package org.zerock.domain.ex01;




public class PageInfoDto {
	
	private int current;
	private int end;
	private int previous;
	private int next;
	
	public int getPrevious() {
		return current-1;
	}

	public void setPrevious(int previous) {
		this.previous = previous;
	}

	public int getNext() {
		return current+1;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	public int getLeft() {
		return Math.max(current-3, 1);
	}
	
	public int getRight() {
		return Math.min(current+3, end);
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getEnd() {
		return end;
	}
	
	public int getCurrent() {
		return current;
	}

}
