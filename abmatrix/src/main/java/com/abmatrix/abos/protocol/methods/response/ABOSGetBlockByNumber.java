package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class ABOSGetBlockByNumber extends Response<ABOSGetBlockByNumber> {

    /**
     * version : 0
     * hash : 0x84ae2857629961fd91458ae5642b0f924f198db397cd5f28d2e7730b5174f389
     * header : {"timestamp":1541034562706,"prevHash":"0x4c24d0252cad9f7ee69ee8e992db44bf6cd85d496ab879a75278a2bd79a67435","number":"0x5009","stateRoot":"0xa4ed05203dc4b7cfca66172ec23bfc8c02d8f8f72a455573967e3194fe42671c","transactionsRoot":"0xde06d7683b17a4f25697b443adcc705ee4102a0b29707dec9edc57eb6e0ae249","receiptsRoot":"0xf75e79e24e3ec0c6a5ece52947cfe5848dd05d2a0a0bbdd22c12f1f38f9d4562","quotaUsed":"0x5208","proof":{"Bft":{"proposal":"0xefaada943a9f636696b55f0af00ad0d28c12b2f1f4ec2587291a97d84c99aa16","height":20488,"round":0,"commits":{"0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc":"0xadecfe570e8b9ad96d7669fb85be254bc81a47e9ededd56a6669e64134f11d113882b7d3557d141d0cab7ef737f17ef7400a46c686ad6119293e3fc9674d181000","0x0b485d306b3f489abc04790a9fcb211c78d1c8fa":"0x38a84c1a326f7b623e23a9bd8f3d3c14c7d4dff856bd251ccd8de3b9c53d526820408ef0594cf133d3b642dc49d472b7076e4ab1438de5fc4c3b7da364c6522000","0xd7f59d4fcfb4aaacb1902c657f27b979ff70c8a8":"0x9fa8b4ce282c56dc3b0b05de6330b54de90d57005633f8546218b186b2780edc49cfca4c807db8c259e62a86decaa150790ed043c45b73a39f50408fe670ed3201"}}},"proposer":"0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc"}
     * body : {"transactions":[{"hash":"0xde06d7683b17a4f25697b443adcc705ee4102a0b29707dec9edc57eb6e0ae249","content":"0x0ac2010a2832316632316364643439623835333739336539396366353933373530373436303338343664333963122439626136303361612d333631332d343537632d393732332d38396132343062323834666118c0843d20dfa0012a44a9059cbb00000000000000000000000022bc8581cff4597060c331e17d1e3867a1182f9b00000000000000000000000000000000000000000000000000000000000003e832200000000000000000000000000000000000000000000000000000000000000000380112419a7f2bd838835626781e4e76dfd86864862a88f6939b7cad9b3a8dabfcf18c7072b0dd26e2bc568736eca425efb6400284a3bbf1f347e81d853ba8ac1160bc6d01"}]}
     */

    private int version;
    private String hash;
    private HeaderBean header;
    private BodyBean body;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public class HeaderBean {
        /**
         * timestamp : 1541034562706
         * prevHash : 0x4c24d0252cad9f7ee69ee8e992db44bf6cd85d496ab879a75278a2bd79a67435
         * number : 0x5009
         * stateRoot : 0xa4ed05203dc4b7cfca66172ec23bfc8c02d8f8f72a455573967e3194fe42671c
         * transactionsRoot : 0xde06d7683b17a4f25697b443adcc705ee4102a0b29707dec9edc57eb6e0ae249
         * receiptsRoot : 0xf75e79e24e3ec0c6a5ece52947cfe5848dd05d2a0a0bbdd22c12f1f38f9d4562
         * quotaUsed : 0x5208
         * proof : {"Bft":{"proposal":"0xefaada943a9f636696b55f0af00ad0d28c12b2f1f4ec2587291a97d84c99aa16","height":20488,"round":0,"commits":{"0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc":"0xadecfe570e8b9ad96d7669fb85be254bc81a47e9ededd56a6669e64134f11d113882b7d3557d141d0cab7ef737f17ef7400a46c686ad6119293e3fc9674d181000","0x0b485d306b3f489abc04790a9fcb211c78d1c8fa":"0x38a84c1a326f7b623e23a9bd8f3d3c14c7d4dff856bd251ccd8de3b9c53d526820408ef0594cf133d3b642dc49d472b7076e4ab1438de5fc4c3b7da364c6522000","0xd7f59d4fcfb4aaacb1902c657f27b979ff70c8a8":"0x9fa8b4ce282c56dc3b0b05de6330b54de90d57005633f8546218b186b2780edc49cfca4c807db8c259e62a86decaa150790ed043c45b73a39f50408fe670ed3201"}}}
         * proposer : 0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc
         */

        private long timestamp;
        private String prevHash;
        private String number;
        private String stateRoot;
        private String transactionsRoot;
        private String receiptsRoot;
        private String quotaUsed;
        private ProofBean proof;
        private String proposer;

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public String getPrevHash() {
            return prevHash;
        }

        public void setPrevHash(String prevHash) {
            this.prevHash = prevHash;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getStateRoot() {
            return stateRoot;
        }

        public void setStateRoot(String stateRoot) {
            this.stateRoot = stateRoot;
        }

        public String getTransactionsRoot() {
            return transactionsRoot;
        }

        public void setTransactionsRoot(String transactionsRoot) {
            this.transactionsRoot = transactionsRoot;
        }

        public String getReceiptsRoot() {
            return receiptsRoot;
        }

        public void setReceiptsRoot(String receiptsRoot) {
            this.receiptsRoot = receiptsRoot;
        }

        public String getQuotaUsed() {
            return quotaUsed;
        }

        public void setQuotaUsed(String quotaUsed) {
            this.quotaUsed = quotaUsed;
        }

        public ProofBean getProof() {
            return proof;
        }

        public void setProof(ProofBean proof) {
            this.proof = proof;
        }

        public String getProposer() {
            return proposer;
        }

        public void setProposer(String proposer) {
            this.proposer = proposer;
        }

        public class ProofBean {
            /**
             * Bft : {"proposal":"0xefaada943a9f636696b55f0af00ad0d28c12b2f1f4ec2587291a97d84c99aa16","height":20488,"round":0,"commits":{"0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc":"0xadecfe570e8b9ad96d7669fb85be254bc81a47e9ededd56a6669e64134f11d113882b7d3557d141d0cab7ef737f17ef7400a46c686ad6119293e3fc9674d181000","0x0b485d306b3f489abc04790a9fcb211c78d1c8fa":"0x38a84c1a326f7b623e23a9bd8f3d3c14c7d4dff856bd251ccd8de3b9c53d526820408ef0594cf133d3b642dc49d472b7076e4ab1438de5fc4c3b7da364c6522000","0xd7f59d4fcfb4aaacb1902c657f27b979ff70c8a8":"0x9fa8b4ce282c56dc3b0b05de6330b54de90d57005633f8546218b186b2780edc49cfca4c807db8c259e62a86decaa150790ed043c45b73a39f50408fe670ed3201"}}
             */

            private BftBean Bft;

            public BftBean getBft() {
                return Bft;
            }

            public void setBft(BftBean Bft) {
                this.Bft = Bft;
            }

            public class BftBean {
                /**
                 * proposal : 0xefaada943a9f636696b55f0af00ad0d28c12b2f1f4ec2587291a97d84c99aa16
                 * height : 20488
                 * round : 0
                 * commits : {"0x176eb9b6e8d837f92b9fccb871a9db5ebcf426bc":"0xadecfe570e8b9ad96d7669fb85be254bc81a47e9ededd56a6669e64134f11d113882b7d3557d141d0cab7ef737f17ef7400a46c686ad6119293e3fc9674d181000","0x0b485d306b3f489abc04790a9fcb211c78d1c8fa":"0x38a84c1a326f7b623e23a9bd8f3d3c14c7d4dff856bd251ccd8de3b9c53d526820408ef0594cf133d3b642dc49d472b7076e4ab1438de5fc4c3b7da364c6522000","0xd7f59d4fcfb4aaacb1902c657f27b979ff70c8a8":"0x9fa8b4ce282c56dc3b0b05de6330b54de90d57005633f8546218b186b2780edc49cfca4c807db8c259e62a86decaa150790ed043c45b73a39f50408fe670ed3201"}
                 */

                private String proposal;
                private BigInteger height;
                private BigInteger round;
                private Map<String, String> commits;

                public String getProposal() {
                    return proposal;
                }

                public void setProposal(String proposal) {
                    this.proposal = proposal;
                }

                public BigInteger getHeight() {
                    return height;
                }

                public void setHeight(BigInteger height) {
                    this.height = height;
                }

                public BigInteger getRound() {
                    return round;
                }

                public void setRound(BigInteger round) {
                    this.round = round;
                }

                public Map<String, String> getCommits() {
                    return commits;
                }

                public void setCommits(Map<String, String> commits) {
                    this.commits = commits;
                }

                @Override
                public String toString() {
                    return "BftBean{" +
                            "proposal='" + proposal + '\'' +
                            ", height=" + height +
                            ", round=" + round +
                            ", commits=" + commits +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "ProofBean{" +
                        "Bft=" + Bft +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "HeaderBean{" +
                    "timestamp=" + timestamp +
                    ", prevHash='" + prevHash + '\'' +
                    ", number='" + number + '\'' +
                    ", stateRoot='" + stateRoot + '\'' +
                    ", transactionsRoot='" + transactionsRoot + '\'' +
                    ", receiptsRoot='" + receiptsRoot + '\'' +
                    ", quotaUsed='" + quotaUsed + '\'' +
                    ", proof=" + proof +
                    ", proposer='" + proposer + '\'' +
                    '}';
        }
    }

    public class BodyBean {

        private List<Map<String, String>> transactions;

        public List<Map<String, String>> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<Map<String, String>> transactions) {
            this.transactions = transactions;
        }

        @Override
        public String toString() {
            return "BodyBean{" +
                    "transactions=" + transactions +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ABOSGetBlockByNumber{" +
                "version=" + version +
                ", hash='" + hash + '\'' +
                ", header=" + header +
                ", body=" + body +
                '}';
    }
}
