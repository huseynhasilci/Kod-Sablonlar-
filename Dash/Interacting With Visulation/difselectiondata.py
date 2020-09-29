import dash
import dash_core_components as dcc
import dash_html_components as html
from dash.dependencies import Input,Output
import pandas as pd
import plotly.graph_objs as go
import numpy as np

app = dash.Dash()

#df = pd.read_csv("")

#create some data

np.random.seed(10)

x1 = np.linspace(0.1,5,50)
x2 = np.linspace(5.1,10,50)
y = np.random.randint(0,50,50)

#df's
df1 = pd.DataFrame({"x":x1,"y":y})
df2 = pd.DataFrame({"x":x1,"y":y})
df3 = pd.DataFrame({"x":x2,"y":y})

df = pd.concat([df1,df2,df3])


app.layout = html.Div([
            html.Div([dcc.Graph(id = "plot",
            figure= {"data":[go.Scatter(x = df["x"],
            y= df["y"],
            mode = "markers")],
            "layout":go.Layout(title="ScatterPlot",
            hovermode="closest")})],style= {"width":"30%","display":"inline-block"}),
            html.Div([
                html.H1(id = "density",style = {"paddingTop":25})

            ],style={"width":"30%","display":"inline-block","verticalAlign":"top"})

])

@app.callback(Output("density","children"),[Input("plot","selectedData")])
def find_density(selectedData):
    #calculate the density
    pts = len(selectedData["points"])#kac tane point secildi burada bunu aldik
    rng_or_lp = list(selectedData.keys())#secilen pointlerin degerlerini alip sozlukten cektik
    rng_or_lp.remove("points")#secilmeyenleri attik
    max_x = max(selectedData[rng_or_lp[0]]["x"])#max min degerlerini aldik
    min_x = min(selectedData[rng_or_lp[0]]["x"])
    max_y = max(selectedData[rng_or_lp[0]]["y"])
    min_y = min(selectedData[rng_or_lp[0]]["y"])
    area = (max_x-min_x)*(max_y-min_y)# alani hesapladik
    dens = pts/area # en son da secilen pointle alani bolup densitiyi bulduk
    return "Density = {:.2f}".format(dens)

if __name__ == "__main__":
    app.run_server()
