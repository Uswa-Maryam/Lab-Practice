public class Artwork{
          private String title;//Title of the artwork
          private int year;//The year the artwork was created
          private Artist artist;//The artist who created the artwork
 
public Artwork(String title, int year, Artist artist){
         this.title=title;
         this.year=year;
         this.artist=artist;
}
public Artwork(String title, int year){
         this.title=title;
         this.year=year;
         this.artist=new Artist("Unknown Artist");
}
         public String getTitle(){
           return title;
}  
       public int getYear(){
        return year;
}   
       public Artist getArtist(){
         return artist;
} 
      public void displayInfo(){
    System.out.println("Title:" + title + "Year:" + year + "Artist:" + artist.getName());
}  
   //@Override
    // public String toString(){
    //  return String.format("%s %d %s", title, year, artist.getName());
    // } 
//@Override
	//public boolean equals(Object o){

		//Artwork temp = (Artwork)o;

		//return temp.title.equals(this.title) && temp.year.equals(this.year)&& temp.artist.equals(this.artist);

 public Artwork shallowCopy(){
     return new Artwork(this.title, this.year, this.artist);
}
  public Artwork deepCopy(){
     return new Artwork(this.title, this.year, new Artist(this.artist.getName()));
}
}