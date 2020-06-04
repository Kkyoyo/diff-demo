package xyz.kkyoyo.eshighleveldemo.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @Author: Kyokyo
 * @Date: 2020-5-8
 */
public class AggT {
    @JSONField(name = "_shards")
    private AggretionResult.ShardsBean shards;
    private AggretionResult.HitsBean hits;
    private int took;
    private boolean timed_out;
    private AggretionResult.AggregationsBean aggregations;

    public AggretionResult.ShardsBean getShards() {
        return shards;
    }

    public void setShards(AggretionResult.ShardsBean shards) {
        this.shards = shards;
    }

    public AggretionResult.HitsBean getHits() {
        return hits;
    }

    public void setHits(AggretionResult.HitsBean hits) {
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

    public AggretionResult.AggregationsBean getAggregations() {
        return aggregations;
    }

    public void setAggregations(AggretionResult.AggregationsBean aggregations) {
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

        private AggretionResult.HitsBean.TotalBean total;
        private List<?> hits;

        public AggretionResult.HitsBean.TotalBean getTotal() {
            return total;
        }

        public void setTotal(AggretionResult.HitsBean.TotalBean total) {
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
        private AggretionResult.AggregationsBean.oneBean one;

        public AggretionResult.AggregationsBean.oneBean getOne() {
            return one;
        }

        public void setOne(AggretionResult.AggregationsBean.oneBean one) {
            this.one = one;
        }

        public static class oneBean {


            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX> buckets;

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

            public List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX> getBuckets() {
                return buckets;
            }

            public void setBuckets(List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX> buckets) {
                this.buckets = buckets;
            }

            public static class BucketsBeanXX {

                private int doc_count;
                private String key;
                @JSONField(name = "sterms#two")
                private AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean two;

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

                public AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean getTwo() {
                    return two;
                }

                public void setTwo(AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean two) {
                    this.two = two;
                }

                public static class twoBean {


                    private int doc_count_error_upper_bound;
                    private int sum_other_doc_count;
                    private List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX> buckets;

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

                    public List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX> getBuckets() {
                        return buckets;
                    }

                    public void setBuckets(List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX> buckets) {
                        this.buckets = buckets;
                    }

                    public static class BucketsBeanX {


                        private int doc_count;
                        @JSONField(name = "lterms#three")
                        private AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean three;
                        private String key;

                        public int getDoc_count() {
                            return doc_count;
                        }

                        public void setDoc_count(int doc_count) {
                            this.doc_count = doc_count;
                        }

                        public AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean getThree() {
                            return three;
                        }

                        public void setThree(AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean three) {
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
                            private List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean.BucketsBean> buckets;

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

                            public List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean.BucketsBean> getBuckets() {
                                return buckets;
                            }

                            public void setBuckets(List<AggretionResult.AggregationsBean.oneBean.BucketsBeanXX.twoBean.BucketsBeanX.threeBean.BucketsBean> buckets) {
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
