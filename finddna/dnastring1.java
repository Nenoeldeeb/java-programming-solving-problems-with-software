public class dnastring1 {
    public String findGene(String d){
        int start = d.indexOf("ATG");
        if(start == -1){
            return "";
        }
        int stop = d.indexOf("TAA", start + 3);
        if(stop == -1){
            return "";
        }
        String gene = d.substring(start , stop + 3);
        if(gene.length() % 3 != 0){
            return "";
        } 
        return gene;
    }
    public void testFindGene(){
        String gene = "CTATGCGCTAGTTCCGCTAACGA";
        System.out.println("The Gene is "+gene);
        String dna = findGene(gene);
        System.out.println("The DNA is "+dna);
        
        gene = "CTATGCGCGGTAGTTCCGCTAACGA";
        System.out.println("The Gene is "+gene);
        dna = findGene(gene);
        System.out.println("The DNA is "+dna);
        
        gene = "CTATACGCTAGTTCCGCTAACGA";
        System.out.println("The Gene is "+gene);
        dna = findGene(gene);
        System.out.println("The DNA is "+dna);
        
        gene = "CTATGCGCTAGTTCCGCTAGCGA";
        System.out.println("The Gene is "+gene);
        dna = findGene(gene);
        System.out.println("The DNA is "+dna);
        
        gene = "CTATCCGCTAGTTCCGCTACCGA";
        System.out.println("The Gene is "+gene);
        dna = findGene(gene);
        System.out.println("The DNA is "+dna);
    }

}
