using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemyPathing : MonoBehaviour
{
    WaveConfig waveConfig; // WaveConfigi tanimladik ki  wave config uzerinde olusturulan metodlara erisebilmek adina
    List<Transform> waypoints;
    

    int waypointIndex = 0;
    // Start is called before the first frame update
    void Start()
    {
        waypoints = waveConfig.GetWayPoints(); // burada da waypointi  wave uzerindekilerden liste olarak cektik ve kordinatlari listemizin icine attik
        transform.position = waypoints[waypointIndex].transform.position;
    }

    // Update is called once per frame
    void Update()
    {
        Move();
    }


    public void SetWaveConfig(WaveConfig waveConfig)
    {
        this.waveConfig = waveConfig; // this ile local degiskeni kast ediyoruz

    }





    private void Move()
    {

        if (waypointIndex <= waypoints.Count - 1)// count burada uzunlugunu alamizi sagliyor
        {
            var targetPosition = waypoints[waypointIndex].transform.position; // gidilmek istenilen targetinm yerini aldik
            var movementThisFrame = waveConfig.GetMoveSpeed() * Time.deltaTime; // gercek zamanli bir hareket sagladik
            transform.position = Vector2.MoveTowards(transform.position, targetPosition, movementThisFrame); //1. parametre olarak ilk oldugu yeri yazdik,2. parametreye gitmesi gereken yeri yazdik,3.parametreye ise hizini yazdik
            if (transform.position == targetPosition) // burada da current pozisyonumuz ulasmasi gereken yere ulasti mi diye konrtol edip indesimizi arttirdik
            {
                waypointIndex++;
            }


        }
        else
        {
            Destroy(gameObject);
        }
    }
}
