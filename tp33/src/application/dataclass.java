package application;

import java.util.ArrayList;
import java.util.List;

public class dataclass {
	private List<person> importlist;
	private List<person> exportList;
	
	public dataclass() {
	importlist = new ArrayList<person>();
	importlist.add(new person("Sami","BenAli","sami@exemple.com"));
	importlist.add(new person("Alia","BenSalah","alia@exemple.com"));
	importlist.add(new person("Ali","BenSalah","ali@exemple.com"));
	exportList = new ArrayList<person>();
	}
	
	public List<person > getImportList() {
	return importlist;
	}
	
	
	public List<person> getExportList() {
	return exportList;
	}
	
	public void setExportList(List<person > exportlist) {
	this.exportList.addAll( exportList);
	for (person p :this.exportList)
	System.out.println(p);

}
	}
