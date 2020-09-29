import plotly.offline as pyo
import plotly.figure_factory as ff
import numpy as np

#x = np.random.randn(1000)
x1 = np.random.randn(200)-2
x2 = np.random.randn(200)
x3 = np.random.randn(200)+2
x4 = np.random.randn(200)+4

snodgrass = [.209,.205,.196,.210,.202,.207,.224,.223,.220,.201]
twain = [.225,.262,.217,.240,.230,.229,.235,.217]

#hist_data = [x1,x2,x3,x4]
hist_data = [snodgrass,twain]

#group_labels = ["displot"]
#group_labels = ["X1","X2","X3","X4"]
group_labels = ["Snodgrass","Twain"]

#fig = ff.create_distplot(hist_data= hist_data,group_labels=group_labels,bin_size = [.2,.1,.3,.4]) # her biri icin bin size i degistrimek icin bin_size kulandik
fig = ff.create_distplot(hist_data= hist_data,group_labels=group_labels,bin_size = [0.005,0.005])
pyo.plot(fig)
