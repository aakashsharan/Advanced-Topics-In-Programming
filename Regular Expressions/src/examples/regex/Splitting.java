package examples.regex;

public class Splitting {

	public static void main(String[] args) {
		String url = "http://10.178.111.165:8380/crs/storeus/browse/productDetailColorSizePicker.jsp?categoryNav=false&navAction=jump&navCount=4&atg.multisite.remap=false&categoryId=catMenShorts&productId=prod20014+containerIdTopSellerQty";
		/*if (url.contains("Ntt")) {
			String[] pSearch = url.split("\\&");
			for (String s : pSearch) {
				if (s.contains("Ntt")) {
					String[] sNew = s.split("\\=");
					if (sNew.length > 1 && !sNew[1].isEmpty() && sNew[1] != null) {
						System.out.println("here " + sNew[1]);
						if (sNew[1].contains("+")) {
							String[] sValues = sNew[1].split("\\+");
							for (String sVals : sValues) {
								System.out.println();
								System.out.println("vals: " + sVals);
							}
						} else {
							System.out.println("vals: " + sNew[1]);
						}
					}
					else{
						Exception ex= new Exception("Ntt value is null");
						ex.printStackTrace();
					}

				}
			}
		}*/
		if(url.contains("+containerId")){
			String[] pSearch = url.split("\\+containerId");
			/*for(String s: pSearch){
				System.out.println("val: " + s);
			}*/
			System.out.println(pSearch[1]);
		}

	}
}
