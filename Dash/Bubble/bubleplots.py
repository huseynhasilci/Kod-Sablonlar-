import plotly.offline as pyo
import plotly.graph_objs as go
import pandas as pd

df = pd.read_csv("mpg.csv")
print(df)
print(df.columns)

data = [go.Scatter(x = df["horsepower"],y = df["mpg"],text=df["name"],mode= "markers",marker=dict(size = 2*df["cylinders"]))]
data1 = [go.Scatter(x = df["horsepower"],y = df["mpg"],text=df["name"],mode= "markers",marker=dict(size = df["weight"]/100,color = df["cylinders"],showscale = True))]
layout = go.Layout(title = "Buble Chart",hovermode="closest")#x y closest
fig = go.Figure(data= data1,layout=layout)
pyo.plot(fig)
