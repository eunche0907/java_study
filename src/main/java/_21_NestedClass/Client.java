package _21_NestedClass;

//빌더 패턴을 적용시켜 주세요
public class Client {
    private String name;
    private String ip;
    private String deviceName;

    private Client(Builder builder){
        this.name = builder.name;
        this.ip = builder.ip;
        this.deviceName = builder.deviceName;
    }
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String ip;
        private String deviceName;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Client build() {
            return new Client(this);
        }
    }




}
