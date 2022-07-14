import java.util.Scanner;


public class stringex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tt=0; tt<t; tt++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			sc.nextLine();
//			System.out.println(r+" "+c);
			char[][] pat = new char[r][c];
			for(int i=0; i<r; i++) {
				String s = sc.nextLine();
				for(int j=0; j<c; j++) {
					pat[i][j] = s.charAt(j);
				}
			}
			int rr = sc.nextInt();
			int cc = sc.nextInt();
			sc.nextLine();
//			System.out.println(rr+" "+cc);
			char[][] tar = new char[rr][cc];
			for(int i=0; i<rr; i++) {
				String s = sc.nextLine();
				for(int j=0; j<cc; j++) {
					tar[i][j] = s.charAt(j);
				}
			}
			
			boolean flag = false;
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
//					System.out.println(i+" "+j);
					if(i+rr > r || j+cc > c) continue;
					boolean f = true;
					for(int jj=cc-1; jj>=0; jj--) {
						for(int ii=rr-1; ii>=0; ii--) {
//							System.out.println(i+" "+j+" "+ii+" "+jj);
							if(pat[i+ii][j+jj] != tar[ii][jj]) {
								f = false;
								break;
							}
						}
						if(!f) break;
					}
					
					if(f) {
						flag = true;
						break;
					}
				}
				if(flag) break;
			}
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}