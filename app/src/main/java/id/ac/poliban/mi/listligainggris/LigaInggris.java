package id.ac.poliban.mi.listligainggris;

public class LigaInggris {
        private String gambar;
        private String namaLogo;
        private String logoDesc;

        public LigaInggris(String gambar, String namaLogo, String logoDesc) {
            this.gambar = gambar;
            this.namaLogo = namaLogo;
            this.logoDesc = logoDesc;
        }

        public String getGambar() {
            return gambar;
        }

        public void setGambar(String gambar) {
            this.gambar = gambar;
        }

        public String getNamaLogo() {
            return namaLogo;
        }

        public void setNamaLogo(String namaLogo) {
            this.namaLogo = namaLogo;
        }

        public String getLogoDesc() {
            return logoDesc;
        }

        public void setLogoDesc(String logoDesc) {
            this.logoDesc = logoDesc;
        }

        @Override
        public String toString(){
            return String.format("%30s\n\n%s", getNamaLogo(), getLogoDesc());

    }
}
