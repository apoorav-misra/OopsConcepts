import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class practice 
{
	public practice A() {
		System.out.println("xyz");
		return this;
	}
	
	public practice B() {
		System.out.println("kfkhks");
		return this;
	}
	
	void C() {
		System.out.println(this.A()+"     "+this.B());
	}
	
	
	public static void main(String[] args) {
		practice p = new practice();
		p.A().B();
		p.C();
	}
}
