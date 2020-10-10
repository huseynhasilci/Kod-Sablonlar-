using System.Collections;
using System.Collections.Generic;
using UnityEngine;


[CreateAssetMenu(menuName = "Enemy Wave Config")]
public class WaveConfig : ScriptableObject
{
    // Start is called before the first frame update
    [SerializeField] GameObject enemyPrefab; // hangi enemy cikacagini ekliyoruz
    [SerializeField] GameObject pathPrefab;// burada olsuturdgumuz pathleri waypointleri ekliyoruz ki dusmanimiz o waypointlere gitsin
    [SerializeField] float timeBetweenSpawns = 0.5f;
    [SerializeField] float spawnRandomFactor = 0.3f;
    [SerializeField] int numberOfEnemies = 5;
    [SerializeField] float moveSpeed = 2f;

    public GameObject GetEnemyPrefab(){return enemyPrefab;}

    public List<Transform> GetWayPoints()
    {
        var waveWaypoints = new List<Transform>(); // way pointleri alabilecek sekilde yerlerini almamizi saglayan bir liste olusturduk

        foreach (Transform child in pathPrefab.transform) //  daha sonra bu pathin icerisindeki waypointler icinde gezip listemizin icine atip listemizi retrun ettik
        {
            waveWaypoints.Add(child);
        }

        return waveWaypoints;
    }

    public float GetTimeBetweenSpawns() { return timeBetweenSpawns; }

    public float GetSpawnRandomFactor() { return spawnRandomFactor; }

    public float GetMoveSpeed() { return moveSpeed; }

    public int GetNumberOfEnemies() { return numberOfEnemies; }




}
