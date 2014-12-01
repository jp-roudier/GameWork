package board;

public class CheckerSquare extends Square {
	private boolean checked;

	public CheckerSquare(boolean checked) {
		this.checked = checked;
	}

	public boolean isChecked() {
		return checked;
	}

	public String toString() {
		return (checked) ? "0" : "1";
	}
}
