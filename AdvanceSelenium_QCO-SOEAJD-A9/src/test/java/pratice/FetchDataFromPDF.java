package pratice;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPDF {

	public static void main(String[] args) throws Throwable {

		File file = new File("./src/test/resources/multipage-pdf.pdf");

		PDDocument doc = PDDocument.load(file);

		int pages = doc.getNumberOfPages();
		System.out.println(pages);//-------->prints num of pages

		PDFTextStripper pdfData = new PDFTextStripper();
//		String readData = pdfData.getText(doc);
//		System.out.println(readData);//------>fetches all the pages data

//		pdfData.setStartPage(3);
//		String readData = pdfData.getText(doc);
//		System.out.println(readData);
		
		pdfData.setStartPage(3);
		pdfData.setEndPage(3);
		String readData = pdfData.getText(doc);
		System.out.println(readData);//----->fetches patricular page data
	}

}
