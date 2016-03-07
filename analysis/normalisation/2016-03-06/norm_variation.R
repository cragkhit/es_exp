norm <- read.csv("~/Documents/es_exp/analysis/normalisation/all.csv")
View(norm)
#norm = normalisation_variation
par(mar=c(10,5,1,1)) 
boxplot(norm, ylab="Precision at 10",las=2)
points(colMeans(norm), col="red")
