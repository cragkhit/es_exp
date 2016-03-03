norm <- read.csv("~/Documents/es_exp/analysis/normalisation_variation.csv")
View(norm)
boxplot(norm, ylab="Precision at 10", xlab="Normalisation actions ([d]atatype, [J]ava class, [k]eyword, Java [p]ackage, [s]tring, [w]ord)", main="Comparison of different normalisation actions")
points(colMeans(norm), col="red")
