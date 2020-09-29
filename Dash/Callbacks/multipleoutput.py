import dash
import dash_core_components as dcc
import dash_html_components as html
from dash.dependencies import Input, Output
import plotly.graph_objs as go
import pandas as pd
import base64




df = pd.read_csv("wheels.csv")

app = dash.Dash()

def encode_image(image_file):
    encoded = base64.b64encode(open(image_file,"rb").read())
    return "Image:image/png;base64,{}".format(encoded.decode())

app.layout = html.Div([
    dcc.RadioItems(id = "wheels",options=[{"label":i,"value":i} for i in df["wheels"].unique()],value = 1),
    html.Div(id = "wheels-output"),
    html.Hr(),
    dcc.RadioItems(id = "colors",options=[{"label":i,"value":i} for i in df["color"].unique()],value = "blue"),
    html.Div(id = "colors-output"),
    html.Img(id = "display-image",src= "children",height=300)


],style={"fontFamily":"helvetica","fontSize":18})



@app.callback(Output("wheels-output","children"),
            [Input("wheels","value")])
def callback_a(wheels_value):
    return "You chose {}".format(wheels_value)



@app.callback(Output("colors-output","children"),
            [Input("colors","value")])
def callback_b(color_value):
    return "You chose {}".format(color_value)
@app.callback(Output("display-image","scr"),
                [Input("wheels","value"),
                Input("colors","value")])
def callbackimage(wheel,color):
    path = "Images/"
    return encode_image(path + df[(df["wheels"== wheel])& (df["color"== color])]["image"].values[0])

if __name__ == "__main__":
    app.run_server()
