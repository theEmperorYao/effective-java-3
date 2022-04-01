package com.tang.effective.effectivejava3.chap2.item2;


import lombok.Data;
import lombok.ToString;

import java.util.Objects;

/**
 * @Title: NyPizza
 * @Description:
 * @author: tangyao
 * @date: 2022/4/1 18:31
 * @Version: 1.0
 */
@ToString
public class NyPizza extends Pizza {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

}