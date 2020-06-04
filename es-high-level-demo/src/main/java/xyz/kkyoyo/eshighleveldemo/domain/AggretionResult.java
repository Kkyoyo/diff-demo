package xyz.kkyoyo.eshighleveldemo.domain;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @Author: Kyokyo
 * @Date: 2020-5-7
 */
public class AggretionResult {


    @JSONField(name = "_shards")
    private ShardsBean shards;
    private HitsBean hits;
    private int took;
    private boolean timed_out;
    private AggregationsBean aggregations;

    public ShardsBean getShards() {
        return shards;
    }

    public void setShards(ShardsBean shards) {
        this.shards = shards;
    }

    public HitsBean getHits() {
        return hits;
    }

    public void setHits(HitsBean hits) {
        this.hits = hits;
    }

    public int getTook() {
        return took;
    }

    public void setTook(int took) {
        this.took = took;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }

    public AggregationsBean getAggregations() {
        return aggregations;
    }

    public void setAggregations(AggregationsBean aggregations) {
        this.aggregations = aggregations;
    }

    public static class ShardsBean {
        /**
         * total : 1
         * failed : 0
         * successful : 1
         * skipped : 0
         */

        private int total;
        private int failed;
        private int successful;
        private int skipped;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getFailed() {
            return failed;
        }

        public void setFailed(int failed) {
            this.failed = failed;
        }

        public int getSuccessful() {
            return successful;
        }

        public void setSuccessful(int successful) {
            this.successful = successful;
        }

        public int getSkipped() {
            return skipped;
        }

        public void setSkipped(int skipped) {
            this.skipped = skipped;
        }
    }

    public static class HitsBean {
        /**
         * hits : []
         * total : {"value":10000,"relation":"gte"}
         */

        private TotalBean total;
        private List<?> hits;

        public TotalBean getTotal() {
            return total;
        }

        public void setTotal(TotalBean total) {
            this.total = total;
        }

        public List<?> getHits() {
            return hits;
        }

        public void setHits(List<?> hits) {
            this.hits = hits;
        }

        public static class TotalBean {
            /**
             * value : 10000
             * relation : gte
             */

            private int value;
            private String relation;

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public String getRelation() {
                return relation;
            }

            public void setRelation(String relation) {
                this.relation = relation;
            }
        }
    }

    public static class AggregationsBean {


        @JSONField(name = "sterms#one")
        private oneBean one;

        public oneBean getOne() {
            return one;
        }

        public void setOne(oneBean one) {
            this.one = one;
        }

        public static class oneBean {


            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<BucketsBeanXX> buckets;

            public int getDoc_count_error_upper_bound() {
                return doc_count_error_upper_bound;
            }

            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
            }

            public int getSum_other_doc_count() {
                return sum_other_doc_count;
            }

            public void setSum_other_doc_count(int sum_other_doc_count) {
                this.sum_other_doc_count = sum_other_doc_count;
            }

            public List<BucketsBeanXX> getBuckets() {
                return buckets;
            }

            public void setBuckets(List<BucketsBeanXX> buckets) {
                this.buckets = buckets;
            }

            public static class BucketsBeanXX {

                private int doc_count;
                private String key;
                @JSONField(name = "sterms#two")
                private twoBean two;

                public int getDoc_count() {
                    return doc_count;
                }

                public void setDoc_count(int doc_count) {
                    this.doc_count = doc_count;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public twoBean getTwo() {
                    return two;
                }

                public void setTwo(twoBean two) {
                    this.two = two;
                }

                public static class twoBean {


                    private int doc_count_error_upper_bound;
                    private int sum_other_doc_count;
                    private List<BucketsBeanX> buckets;

                    public int getDoc_count_error_upper_bound() {
                        return doc_count_error_upper_bound;
                    }

                    public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                        this.doc_count_error_upper_bound = doc_count_error_upper_bound;
                    }

                    public int getSum_other_doc_count() {
                        return sum_other_doc_count;
                    }

                    public void setSum_other_doc_count(int sum_other_doc_count) {
                        this.sum_other_doc_count = sum_other_doc_count;
                    }

                    public List<BucketsBeanX> getBuckets() {
                        return buckets;
                    }

                    public void setBuckets(List<BucketsBeanX> buckets) {
                        this.buckets = buckets;
                    }

                    public static class BucketsBeanX {


                        private int doc_count;
                        @JSONField(name = "lterms#three")
                        private threeBean three;
                        private String key;

                        public int getDoc_count() {
                            return doc_count;
                        }

                        public void setDoc_count(int doc_count) {
                            this.doc_count = doc_count;
                        }

                        public threeBean getThree() {
                            return three;
                        }

                        public void setThree(threeBean three) {
                            this.three = three;
                        }

                        public String getKey() {
                            return key;
                        }

                        public void setKey(String key) {
                            this.key = key;
                        }

                        public static class threeBean {


                            private int doc_count_error_upper_bound;
                            private int sum_other_doc_count;
                            private List<BucketsBean> buckets;

                            public int getDoc_count_error_upper_bound() {
                                return doc_count_error_upper_bound;
                            }

                            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
                            }

                            public int getSum_other_doc_count() {
                                return sum_other_doc_count;
                            }

                            public void setSum_other_doc_count(int sum_other_doc_count) {
                                this.sum_other_doc_count = sum_other_doc_count;
                            }

                            public List<BucketsBean> getBuckets() {
                                return buckets;
                            }

                            public void setBuckets(List<BucketsBean> buckets) {
                                this.buckets = buckets;
                            }

                            public static class BucketsBean {


                                private String key_as_string;
                                private int doc_count;
                                private String key;

                                public String getKey_as_string() {
                                    return key_as_string;
                                }

                                public void setKey_as_string(String key_as_string) {
                                    this.key_as_string = key_as_string;
                                }

                                public int getDoc_count() {
                                    return doc_count;
                                }

                                public void setDoc_count(int doc_count) {
                                    this.doc_count = doc_count;
                                }

                                public String getKey() {
                                    return key;
                                }

                                public void setKey(String key) {
                                    this.key = key;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
