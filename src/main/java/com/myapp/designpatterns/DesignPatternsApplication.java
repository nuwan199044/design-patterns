package com.myapp.designpatterns;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		ReaderService readerService = new ReaderService();

		Document pdf = new PdfDocument("Annual Report");
		Document excel = new ExcelDocument("Budget Sheet");
		Document readOnly = new ReadOnlyDocument("Pay Sheet");

		readerService.readDocument(pdf);
		readerService.readDocument(excel);
		readerService.readDocument(readOnly);

		ExporterService exporterService = new ExporterService();

		Exportable pdfEx = new PdfDocument("Annual Report");
		Exportable excelEx = new ExcelDocument("Budget Sheet");

		exporterService.exportDocument(pdfEx);
		exporterService.exportDocument(excelEx);

	}

}
