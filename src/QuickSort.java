package QuickSort;

public class QuickSort {

        private String[] dataJSONOBJECT;

        public QuickSort() {
        }

        public String[] getData() { return dataJSONOBJECT; }

        public void setData(String[] data) {
            this.dataJSONOBJECT = data;
        }

        public void sortData() {
            int Hero = this.dataJSONOBJECT.length;
            for (int i = 0;i<Hero;i++) {
                for (int j=i+1;j<Hero;j++) {
                    if (this.dataJSONOBJECT[j]. compareTo(this.dataJSONOBJECT[i]) < 0) {
                        String temp = this.dataJSONOBJECT[i];
                        this.dataJSONOBJECT[i] = this.dataJSONOBJECT[j];
                        this.dataJSONOBJECT[j] = temp;
                    }
                }
            }
        }

        public void PrintData() {
            for (String datum : this.dataJSONOBJECT) {
                System.out.println(datum+" ");
            }
        }

        public static void main(String[] args) {
            String[] nama = {"author","category","changelog","contentRating","datePublished","datePublishedISO","description","shortdescription","filesize","icon","inAppBilling","name","numDownloads","operatingSystems"};
           QuickSort _myBubble = new QuickSort();
            _myBubble.setData(nama);
            _myBubble.sortData();
            _myBubble.PrintData();
        }
    }
