es_tests_decompiled <- read.csv("~/Documents/es_exp/analysis/compile-decompile/es_tests_decompiled.csv")
View(es_tests_decompiled)
boxplot(es_tests_decompiled)
boxplot(es_tests_decompiled, ylim = c(0.4:1.0))
boxplot(es_tests_decompiled, pars=list(ylim=c(0.4,1.0)))
boxplot(es_tests_decompiled, pars=list(ylim=c(0.8,1.0)))
boxplot(es_tests_decompiled)
mean = colMeans(es_tests_decompiled)
points(mean, col="red")
title("Precision at 10 before/after comp/decompilation")
