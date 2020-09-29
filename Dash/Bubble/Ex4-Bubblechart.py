#######
# Objective: Create a bubble chart that compares three other features
# from the mpg.csv dataset. Fields include: 'mpg', 'cylinders', 'displacement'
# 'horsepower', 'weight', 'acceleration', 'model_year', 'origin', 'name'
######

# Perform imports here:
import plotly.offline as pyo
import plotly.graph_objs as go
import pandas as pd



# create a DataFrame from the .csv file:
df = pd.read_csv("mpg.csv")

# create data by choosing fields for x, y and marker size attributes

data = [go.Scatter(x = df["acceleration"],y = df["displacement"],text = df["name"],mode = "markers",marker = dict(size = df["weight"]/400,color = df["displacement"],showscale = True))]






# create a layout with a title and axis labels
layout = go.Layout(title="Buble Chart Exercise")






# create a fig from data & layout, and plot the fig
fig = go.Figure(data = data,layout=layout)
pyo.plot(fig)
