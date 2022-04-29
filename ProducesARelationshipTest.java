
public class ProducesARelationshipTest {

	public static void main(String[] args) 
	{
		File f=new File();
		ExcelSheet ex= f.exsh();
		Worksheet w=ex.sheet();
		Cell c1= w.cl();
		Data dd=c1.dataret();
		dd.output();
		}

}
 class exlsht
{
static int excelsheetnubr;
}

class File
{
	ExcelSheet exsh()
	{
		ExcelSheet exsheet=new ExcelSheet();
		return exsheet;
	}
}
class ExcelSheet
{
	Worksheet sheet()
	{
	Worksheet w= new Worksheet();
	return w;
	}	
}

class Worksheet 
{
	Cell cl()
	{
		Cell c=new Cell();	
		return c;
	}
}
class Cell
{
	Data dataret()
	{
		Data data =new Data();
		Data d=new Data();
		return d;
	}
}

class Data
{
	void output()
	{
		System.out.println("data is Generated ");
	}
}


