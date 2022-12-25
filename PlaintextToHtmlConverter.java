package cw22Dec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {
    String source;
    List<String> result;
    List<String> convertedLine;
    char characterToConvert;

    public String toHtml() throws Exception {
        String text = new String(Files.readAllBytes(Paths.get("sample.txt")));
        String htmlLines = basicHtmlEncode(text);
        return htmlLines;
    }

    private String basicHtmlEncode(String source) {
        this.source = source;
        result = new ArrayList<>();
        convertedLine = new ArrayList<>();
                
        for ( int i = 0;i < this.source.length();i++) {
        	characterToConvert = source.charAt(i);
        	convertCharacter();
        }
        
        addANewLine();
        String finalResult = String.join("<br />", result);
        return finalResult;
    }

    private void addANewLine() {
        String line = String.join("", convertedLine);
        result.add(line);
        convertedLine = new ArrayList<>();
    }
    
    private void convertCharacter() {
    	
    	if (characterToConvert=='<') {
        	convertedLine.add("&lt;");}
    	
        else if (characterToConvert=='>') {
        	convertedLine.add("&gt;");}
    	
        else if (characterToConvert=='&') {
        	convertedLine.add("&amp;");}
    	
        else if (characterToConvert=='\n') {
        	addANewLine();
        	}
        else {
        	convertedLine.add(String.valueOf(characterToConvert));}
    }
}
